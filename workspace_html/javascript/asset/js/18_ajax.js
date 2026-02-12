window.addEventListener('load', bind);

function bind() {
    const btn1 = document.querySelector('#btn1')
    btn1.addEventListener('click', function () {

        // ajax 객체 생성
        const xhr = new XMLHttpRequest();

        // 보낼 준비
        // 방식method, 주소
        xhr.open('get', 'https://jsonplaceholder.typicode.com/users')

        // 보내기
        xhr.send()
        console.log(0, xhr.responseText)

        // 다녀왔다면
        xhr.onload = function () {
            console.log('다녀왔어')
            console.log(xhr.responseText)

            // 깜짝 퀴즈
            // 두번째 사람의 이름을 출력한다
            // 세번째 사람의 lat를 출력한다

            const member = JSON.parse(xhr.responseText)
            console.log(member)
            console.log(member[1])
            console.log(member[1].name)
            console.log(member[1]['name'])

            console.log(member[2].address.geo.lat)

        }
    })

    document.querySelector('#btn2').addEventListener("click", function () {
        // ajax 객체 생성
        const xhr = new XMLHttpRequest();

        // 보낼 준비
        // 방식method, 주소
        xhr.open('get', '17_json.html')

        // 보내기
        xhr.send()

        // 다녀왔다면
        xhr.onload = function () {
            console.log(xhr.responseText)
        }
    })
    document.querySelector('#btn3').addEventListener("click", function () {

        const xhr = new XMLHttpRequest();

        const key = 'qVTaW2lslPLGXY2uHKVY3Vuc66ZQmC950RmMKYEg4Grvfz%2FeYbsd%2Fp4F0CzdQQwC26aBf2fTEHW76VU0OA04RQ%3D%3D'
        let url = 'http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtFcst'
        url += '?serviceKey=' + key
        url += '&numOfRows=1000'
        url += '&pageNo=1'
        url += '&dataType=JSON'
        url += '&base_date=20260212'
        url += '&base_time=1300'
        url += '&nx=63'
        url += '&ny=110'

        xhr.open('get', url)
        xhr.send()

        xhr.onload = function () {
            // console.log( xhr.responseText )
            const data = JSON.parse(xhr.responseText)
            console.log(data)

            // 1. 첫번째 자료의 category, fcstValue 출력
            console.log(1, data.response.body.items.item[0].category)
            console.log(1, data.response.body.items.item[0].fcstValue)

            // 2. category가 T1H(기온), RN1(강수량), REH(습도) 모두 출력

            // 이렇게도 해보자
            // let json = {
            //     '1400': {
            //         T1H: 8,
            //         RN1: '강수없음',
            //         REH: 45
            //     },
            //     '1500': {
            //         T1H: 8,
            //         RN1: '강수없음',
            //         REH: 48
            //     }
            // }
            // // console.log(json['1700'])
            // // if(json['1700'] == undefined){
            // if(!json['1700']){
            //     json['1700'] = {}
            // }
            // json['1700']['T1H'] = 9

            let json = {}

            const item = data.response.body.items.item
            for (let i = 0; i < item.length; i++) {
                if (item[i].category == 'T1H') {
                    console.log(item[i])
                    /*
                        <tr>
                            <td>1400</td>
                            <td>8</td>
                        </tr>
                    */
                    document.querySelector('#temp').innerHTML += `
                        <tr>
                            <td>${item[i].fcstTime}</td>
                            <td>${item[i].fcstValue}</td>
                        </tr>
                    `

                    if (!json[item[i].fcstTime]) {
                        json[item[i].fcstTime] = {}
                    }
                    json[item[i].fcstTime][item[i].category] = item[i].fcstValue
                }
                if (item[i].category == 'RN1') {
                    console.log(item[i])

                    if (!json[item[i].fcstTime]) {
                        json[item[i].fcstTime] = {}
                    }
                    json[item[i].fcstTime][item[i].category] = item[i].fcstValue


                }
                if (item[i].category == 'REH') {
                    console.log(item[i])

                    if (!json[item[i].fcstTime]) {
                        json[item[i].fcstTime] = {}
                    }
                    json[item[i].fcstTime][item[i].category] = item[i].fcstValue
                }
            }

            console.log(json)

            // 3. 2번 내용을 html에 테이블로 출력
        }

    })


    const btn4 = document.querySelector('#btn4')
    btn4.addEventListener('click', function () {

        // const xhr = new XMLHttpRequest();
        // xhr.open('get', 'https://jsonplaceholder.typicode.com/users')
        // xhr.send()
        // xhr.onload = function () {
        //     let response = xhr.responseText
        //     let json = JSON.parse(response)
        //     console.log(json)
        // }

        const url = 'https://jsonplaceholder.typicode.com/users'
        const option = {
            method: 'get'
        }

        fetch(url, option).then(function(response){
            return response.json()
        }).then(function(json){
            console.log(json)
        }).catch(function(error){
            console.error(error)
        })

    })
    const btn5 = document.querySelector('#btn5')
    btn5.addEventListener('click', function () {

        const xhr = new XMLHttpRequest();
        xhr.open('get', 'https://jsonplaceholder.typicode.com/users')

        xhr.onreadystatechange = function () {
            console.log(xhr.readyState)
            if(xhr.readyState == 4){
            // if(xhr.readyState == XMLHttpRequest.DONE){
                console.log('다녀왔어')
            }
        } 
        xhr.send()
    })

}



