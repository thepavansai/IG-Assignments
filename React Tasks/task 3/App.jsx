// 0
import './App.css'
import { BrowserRouter, Routes, Route } from "react-router";
import Axiosapi from './Http/Axiosapi'
import Boo from './Boo'
import Calc from './Calc'
import Foo from './Foo'
import Headers from './Header'
import Mobile from '../../../React Tasks/task 1/Mobile'
import PropThings from './PropThings'
import ValidateForm from './ValidateForm'
import Home from './task 2/Home';
import Signup from './task 2/Signup';
import Login from './task 2/Login';
function App() {
  // const [count, setCount] = useState(0)

  // return (
  //   <>
  //     <div>
  //       <a href="https://vite.dev" target="_blank">
  //         <img src={viteLogo} className="logo" alt="Vite logo" />
  //       </a>
  //       <a href="https://react.dev" target="_blank">
  //         <img src={reactLogo} className="logo react" alt="React logo" />
  //       </a>
  //     </div>
  //     <h1>Vite + React</h1>
  //     <div className="card">
  //       <button onClick={() => setCount((count) => count + 1)}>
  //         count is {count}
  //       </button>
  //       <p>
  //         Edit <code>src/App.jsx</code> and save to test HMR
  //       </p>
  //     </div>
  //     <p className="read-the-docs">
  //       Click on the Vite and React logos to learn more
  //     </p>
  //   </>
  //)
  return(
    // <div>
    //   <Headers/>
    //   <h1>Phantom</h1>
    //   <Foo year="2025"/>
    //   <Child/>
    //   <Boo/>
    // </div>
    // <Calc/>
    // <Mobile/>
    // <PropThings/>
        //axios.get('https://jsonplaceholder.typicode.com/users')
    //  <Axiosapi/>
    // <ValidateForm/>
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<Home/>} />
      <Route path='/signup' element={<Signup/>}/>
      <Route path='/login' element={<Login/>}/>
    </Routes>
  </BrowserRouter>
  )
}

export default App

function Child(){
  return(<footer>
    Dark Knight
  </footer>)
}