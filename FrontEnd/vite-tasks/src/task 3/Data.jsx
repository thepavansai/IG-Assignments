import React from 'react';

const Data = (WrappedComponent, data) => {
    return class extends React.Component {
        render() {
            return <WrappedComponent {...this.props} data={data} />;
        }
    };
};

export default Data;
