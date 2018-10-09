import React from  'react';

const Action= (props) =>(
    <div>
    <button 
    className="big-button"
    onClick={props.handlePick}
    disabled={!props.hasOptions}
    > 
    What should Ankit do in long weekend</button>
    </div>
);  

export default Action;