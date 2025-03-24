import React from 'react';
import Data from './Data';
import { ProductList, EmployeeList } from './Lists';

const data = {
    products: [
        { id: 1, name: 'Product A', price: '$10' },
        { id: 2, name: 'Product B', price: '$20' },
    ],
    employees: [
        { id: 1, name: 'John Doe', position: 'Manager' },
        { id: 2, name: 'Jane Smith', position: 'Developer' },
    ],
};

const EnhancedProductList = Data(ProductList, data);
const EnhancedEmployeeList = Data(EmployeeList, data);

const HOCList = () => {
    return (
        <div>
            <h2>Product List</h2>
            <EnhancedProductList />
            <h2>Employee List</h2>
            <EnhancedEmployeeList/>
        </div>
    );
};

export default HOCList;
