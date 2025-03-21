// 0
import './App.css'
import Boo from './Boo'
import Calc from './Calc'
import Foo from './Foo'
import Headers from './Header'
import Mobile from './Mobile'
import PropThings from './PropThings'
import ValidateForm from './ValidateForm'
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
    <ValidateForm/>
  )
}

export default App

function Child(){
  return(<footer>
    Dark Knight
  </footer>)
}