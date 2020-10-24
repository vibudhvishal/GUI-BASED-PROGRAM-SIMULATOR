let count = 0;
const addOne = () => {
    count++;
    //console.log('addOne');
    renderCounterApp();
};
const minusOne = () => {
    count--;
    //console.log('minusOne');
    renderCounterApp();
};
const reset = () => {
    //console.log('reset');
    count = 0;
    renderCounterApp();
};



    const renderCounterApp = () => {
        const templateTwo = (
            <div>
                <h1>Count: {count}</h1>
                <button onClick={addOne}>+1</button>
                <button onClick={minusOne}>-1</button>
                <button onClick={reset}>Reset</button>
            </div>
        );
        ReactDOM.render(templateTwo, appRoot);
    }

    renderCounterApp();



    //console.log(templateTwo);
    //var template = /*#__PURE__*/React.createElement("p", null, "This is jsx something new");
    
    

    
    //ReactDOM.render(template2,appRoot);

//ReactDOM.render(template2,appRoot);