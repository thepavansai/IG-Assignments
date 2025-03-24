import { useState } from "react"

function Signup() {
    const [customers, setCustomer] = useState([])
    const [customerId, setCustomerId] = useState(null)
    const [name, setName] = useState(null)
    const [email, setEmail] = useState(null)
    const [gender, setGender] = useState(null)
    const [city, setCity] = useState(null)
    const handleSubmit = event => {
        event.preventDefault()
        if(customerId===null ||name==null||email===null||gender==null||city==null){
            alert("Fill all the deatils in Sign Up form")
        }else{
        const data = {
            id: customerId,
            name: name,
            email: email,
            gender: gender,
            city: city
        }
        setCustomer((p) => [...p, data])
    }

        setName(null)
        setCity(null)
        setCustomerId(null)
        setEmail(null)
        setGender(null)
    }
    return (
        <div style={{margin:'50px'}}>
            <form onSubmit={handleSubmit}>
                <fieldset>
                    <legend><h2>Signup</h2></legend>
                    <div>
                        <label>
                            Customer ID:
                            <input
                                type="number"
                                value={customerId}
                                onChange={(e) => setCustomerId(e.target.value)}
                            />
                        </label>
                    </div>
                    <div>
                        <label>
                            Name:
                            <input
                                type="text"
                                value={name}
                                onChange={(e) => setName(e.target.value)}
                            />
                        </label>
                    </div>
                    <div>
                        <label>
                            Email:
                            <input
                                type="email"
                                value={email}
                                onChange={(e) => setEmail(e.target.value)}
                            />
                        </label>
                    </div>
                    <div>
                        <label>
                            Gender:
                            <select  value={gender} onChange={(e) => setGender(e.target.value)}>
                                <option value="">Select</option>
                                <option value="Male">Male</option>
                                <option value="Female">Female</option>
                            </select>
                        </label>
                    </div>
                    <div>
                        <label>
                            City:
                            <input
                                type="text"
                                value={city}
                                onChange={(e) => setCity(e.target.value)}
                            />
                        </label>
                    </div>

                    <button type="submit">Add Customer</button>
                </fieldset>
            </form>

            <h2>Customer List</h2>
            <ul>
                {customers.map((customer) => (
                    <li key={customer.id}>
                        {customer.name} ({customer.email}) - {customer.gender}, {customer.city}
                    </li>
                ))}
            </ul>
        </div>
    );
}
export default Signup