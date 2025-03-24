import { useState } from "react";

function ValidateForm(){
    const [formdata,setFormData]=useState(
        {
            name:"",
            email:"",
            password:"",
        }
    )
    const [errors,setErrors]=useState({})
    const validate=()=>{
        let err={};
        if(!formdata.name)
            err.name="Name is Required."
        if(!formdata.email)
            err.email="Email cannot be null"
        if(!formdata.password){
            err.password="Password cannot be null."
        }
        else if(formdata.password.length<8){
            err.password="Password lenght should be >=8."
        }
        setErrors(err)
        return Object.keys(err).length===0
    }
    const handleChange=(event)=>{
        setFormData({...formdata,[event.target.name]:event.target.value})
    }
    const handleSubmit=(e)=>{
        e.preventDefault();
        console.log(errors)
        if(validate()){
            alert("Submitted SuccessFully")
            console.log(formdata)
        }
        else{
            console.log(errors)
        }
    }
    return(
        <>
        <h3>Form Validation</h3>
        <form onSubmit={handleSubmit}>
            <div>
                <label>Name : </label>
                <input type="text" name="name" value={formdata.name} onChange={handleChange}/><br></br>
                <label>Email : </label>
                <input type="email" name="email"value={formdata.email} onChange={handleChange}/><br></br>
                <label>Passord: </label>
                <input type="password" name="password" value={formdata.password} onChange={handleChange}/><br></br>
                <input type="submit"/>
            </div>
            <div>
            {Object.keys(errors).length > 0 && (
                        <div style={{ color: "red" }}>
                            Please correct the following errors:
                            <ul>
                                {Object.keys(errors).map((key) => (
                                    <li key={key}>
                                        {key.charAt(0).toUpperCase() + key.slice(1)}: {errors[key]}
                                    </li>
                                ))}
                            </ul>
                        </div>
                    )}

            </div>
        </form>
        </>
    )

}
export default ValidateForm;