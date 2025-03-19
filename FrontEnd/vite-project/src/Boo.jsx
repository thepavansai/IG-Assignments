import React from "react";
 class Boo extends React.Component{
    constructor(){
        super()
        this.state={value:''}
        this.handleChange = this.handleChange.bind(this)
        this.handleSubmit=this.handleSubmit.bind(this)
    }
    handleChange(event){
        this.setState({value:event.target.value})
    }
    handleSubmit(event){
        alert("Submitted Value : "+this.state.value);
        event.preventDefault();
    }
    render(){
        return(
            <div>
                <form onSubmit={this.handleSubmit}>
                    <label>
                        Name : <input type="text" onChange={this.handleChange}/> 
                    </label>
                    <br></br><h3>Value : {this.state.value}ṭṭ</h3><br></br>
                    <button>Submit</button>
                 </form>
            </div>
        )
    }
 }
export default Boo;