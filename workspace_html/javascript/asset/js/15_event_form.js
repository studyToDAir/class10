window.addEventListener('load', function () {

    const log = document.querySelector('#log')

    window.addEventListener('resize', function () {
        const w = window.innerWidth;
        const h = window.innerHeight;

        log.innerHTML = `<br>너비:${w}, 높이:${h}` + log.innerHTML;
    })

    const id = document.querySelector('#id')
    id.addEventListener('focus', function () {
        id.style.backgroundColor = 'yellow'
    })
    id.addEventListener('blur', function () {
        id.style.backgroundColor = ''
    })
    // input text등이 변경될 때 마다
    id.addEventListener('input', function () {
        const r = parseInt(Math.random() * 256)
        const g = parseInt(Math.random() * 256)
        const b = parseInt(Math.random() * 256)
        const a = Math.random()

        id.style.backgroundColor = `rgba(${r},${g},${b},${a})`
    })

    const form = document.querySelector('#form')
    const site = document.querySelector('#site')
    site.addEventListener('change', ()=>{
        console.log( site.value )
        
        if(site.value == 1){
            // naver
            form.setAttribute('action', 'https://search.naver.com/search.naver')
        } else if(site.value == 2){
            // google
            form.setAttribute('action', 'https://www.google.com/search')
        }
    })

    form.addEventListener('submit', function(event){

        // html 태그의 고유(기본) 기능을 막아준다
        // 여기서는 submit의 기능을 막음
        event.preventDefault()

        // 검색어가 두글자 이하면
        if(id.value.length <= 2){
            alert('검색어는 두글자 이상입니다')
        } else {
            form.submit()
        }
    })

    addEventListener('copy', function(event){
        event.preventDefault()
        this.alert('복사금지')
    })
    addEventListener('selectstart', function(event){
        event.preventDefault()
    })

})