import React from 'react';
import Data from './Data';
import { ProductList, EmployeeList } from './Lists';

const data = {
    products: [
        { id: 1, name: 'BatMobile', price: '99999' },
        { id: 2, name: 'Bat Suite', price: '99999' },
    ],
    employees: [
        { id: 1, name: 'Brue Wyane', position: 'Owner' },
        { id: 2, name: 'Alfred', position: 'Butler' },
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
