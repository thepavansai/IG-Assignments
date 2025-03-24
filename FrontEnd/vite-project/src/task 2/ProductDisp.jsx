import React, { useEffect, useState } from 'react';
import BootstrapTable from 'react-bootstrap-table-next';

const ProductDisp = () => {
    const [products, setProducts] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        const fetchProducts = async () => {
            try {
                const response = await fetch('http://localhost:8080/api/products'); 
                if (!response.ok) {
                    throw new Error('Failed to fetch products');
                }
                const data = await response.json();
                setProducts(data);
            } catch (error) {
                setError(error.message);
            } finally {
                setLoading(false);
            }
        };

        fetchProducts();
    }, []);

    if (loading) return <p>Loading...</p>;
    if (error) return <p>Error: {error}</p>;

    const columns = [
        {
            dataField: 'id',
            text: 'Product ID',
        },
        {
            dataField: 'name',
            text: 'Product Name',
        },
    ];

    return (
        <div className="container mt-5">
            <h2 className="text-center">Product List</h2>
            <BootstrapTable keyField='id' data={products} columns={columns} striped bordered hover />
        </div>
    );
};

export default ProductDisp;
