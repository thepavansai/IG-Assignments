import { useState } from "react";
import { useNavigate } from 'react-router-dom';

function Login(){
    const navigate = useNavigate();

    const [username,setUsername]= useState('')
    const[password,setPassword]= useState('')
    const handleSubmit=(event)=>{
        event.preventDefault(); // Prevent the default form submission behavior
        console.log(password)
        if (username === "iguser" && password ==="pass") {
            alert("Successful Login");
            navigate('/')

        } else {
            alert("Login Failed");
        }
    }
    return(
        <form onSubmit={handleSubmit}>
           <fieldset>
            <legend><h2>Login Page</h2></legend>
                 <label htmlFor="username">
                    Username
                </label> 
                {/* <br></br> */}
                <input type="text" id="username" autoComplete="on" placeholder="username" onChange={(e)=>setUsername(e.target.value)}>
                </input>
                <br></br>
                <label htmlFor="password">
                    Password:
                </label>
                <input type="password" id="password" autoComplete="on" placeholder="password" onChange={(e)=>setPassword(e.target.value)}>
                </input>
                <br></br>
                <button>Login </button>
            </fieldset>
        </form>
    )
}
export default Login