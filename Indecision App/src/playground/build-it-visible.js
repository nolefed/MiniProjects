const app = {
title: 'Visibility Toggle'
};

let visibility =false;

const appRoot = document.getElementById('app');

const toggleVisibility = () =>{
    visibility=!visibility;
    render();
}


const render = () =>{
    const template =(
        <div>
        <h1> {app.title}</h1>
        <button onClick={toggleVisibility}> {visibility ? 'Hide Details' : 'Show Details'} </button>
        {visibility && (
            <div>
            <p> Hey These are some details you can now see </p>
            </div>
        )}
        </div>
    )
    ReactDOM.render(template, appRoot);
};

render();