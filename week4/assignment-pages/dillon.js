let button = document.getElementById('button');
let paragraph = document.querySelector('#p');

button.addEventListener('click', (e)=>{
    paragraph.style.backgroundColor ='yellow';
})

let mouseOver = paragraph.addEventListener('mouseover', (e)=>{
    if(paragraph.style.backgroundColor == 'yellow'){
        paragraph.style.backgroundColor = 'pink';
    }
    if(paragraph.style.backgroundColor == 'pink'){
        paragraph.style.backgroundColor == 'yellow'
    }
    
    paragraph.innerText = 'Hover Over This To Change Color'

    mouseOver();
});
