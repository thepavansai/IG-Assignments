function PropThings(){
    const theme="blue";
    return(
        <Parent theme={theme}/>
    )
}
function Parent({theme}){
    return<Child theme={theme}/>
}
function Child({theme}){
    return <Button theme={theme}/>
}
function Button({theme}){
    return <><button style={{ background: theme === "blue" ? "blue" : "black" }}>
    Click</button>
<h1>Theme: {theme}</h1></>
}

export default PropThings