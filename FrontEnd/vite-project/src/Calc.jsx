import React from "react";

class Calc extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            num1: 0,
            num2: 0
        };

        this.handleInputChange = this.handleInputChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleInputChange(event) {
        this.setState({
            [event.target.name]: event.target.value
        });
    }

    handleSubmit(event) {
        event.preventDefault();
        // Additional logic can be added here if needed
    }

    render() {
        return (
            <div className="calculator-app">
                <h1>Calculator</h1>
                <form onSubmit={this.handleSubmit}>
                    <input
                        type="number"
                        name="num1"
                        value={this.state.num1}
                        onChange={this.handleInputChange}
                        placeholder="Enter first number"
                        required
                    /><br></br>
                    <input
                        type="number"
                        name="num2"
                        value={this.state.num2}
                        onChange={this.handleInputChange}
                        placeholder="Enter second number"
                        required
                    /><br></br><br></br>
                    <button type="submit">Calculate</button>
                </form>

                <Calculator
                    number1={parseFloat(this.state.num1)}
                    number2={parseFloat(this.state.num2)}
                />
            </div>
        );
    }
}

class Calculator extends React.Component {
    render() {
        const { number1, number2 } = this.props;
        const sum = number1 + number2;
        const difference = number1 - number2;
        const product = number1 * number2;

        return (
            <div className="results">
                <h2>Calculation Results</h2>
                <p>Sum: {sum}</p>
                <p>Difference: {difference}</p>
                <p>Product: {product}</p>
            </div>
        );
    }
}

export default Calc;
