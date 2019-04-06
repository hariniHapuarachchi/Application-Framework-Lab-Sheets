'use strict'

const express = require('express');

const app = express();
app.use(express.json());
app.use(express.static(__dirname));


app.get('/',(req,res,next) => {
    res.sendFile('index.html')
});
// var arr = [];
// app.post('/',(req,res,next) => {
//
//     const fName = req.body.fName;
//     const sName = req.body.sName;
//     const bod = req.body.bod;
//
//     // var arr = [];
//     arr.push(fName);
//     arr.push(sName);
//     arr.push(bod);
//
//     console.log(arr[0]);
//
//     res.sendStatus(200);
// });
const users = [];
app.post('/users', (req, res, next) => {
    const user = req.body;
    user.birthday = new Date(user.birthday);
    user.id = Date.now();
    users.push(user);
    res.json(user);
});

app.listen(3000,err => {
    if (err){
        console.error(err);
        return;
    }

    console.log('app listening on port 3000');
});