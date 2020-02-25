function regCheck() {
    // boolean control whole validation
    var isPass = true;

    var username = document.getElementById("userName");
    var userLength = username.value.length;

    var emailAdd = document.getElementById("emailAdd").value;
    var emailVali = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;

    var pwd = document.getElementById("pwd");
    var pwdConf = document.getElementById("pwdConf");

    var userNameMsg = document.getElementById("userNameMsg").value;
    var emailAddMsg = document.getElementById("emailAddMsg").value;
    var pwdMsg = document.getElementById("pwdMsg");
    var pwdConfMsg = document.getElementById("pwdConfMsg");

    if(userLength<3 || userLength>8) {
        userNameMsg.innerText="User name range should be 3 to 8";
        isPass = false;
    } else {
        userNameMsg.innerText="";
    }

    if(emailVali.test(emailAdd)==false) {
        emailAddMsg.innerText="email address cannot not matched";
        isPass = false;
    } else {
        emailAddMsg.innerText="";
    }

    if(pwd.length<6 || pwd.length>12) {
        // window.alert("pwd range shoule be 6 to 12");
        pwdMsg.innerText="pwd range shoule be 6 to 12";
        isPass = false;
    } else {
        if(pwd != pwdConf) {
            // window.alert("two pwd does not match");
            pwdMsg.innerText="two pwd does not match";
            pwdConfMsg.innerText="two pwd does not match";
            isPass = false;
        } else {
            pwdMsg.innerText="";
            pwdConfMsg.innerText="";
        }
    }

    return isPass;
}

function checkUserName(userName) {
    var userNameMsg = document.getElementById("userNameMsg");
    var userLength = userName.value.length;

    if(userLength<3 || userLength>8) {
        userNameMsg.innerText="User name range should be 3 to 8";
    } else {
        userNameMsg.innerText="";
    }

}

function checkEmailAdd(emailAdd) {
    var emailVali = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
    var emailAddMsg = document.getElementById("emailAddMsg");

    if(emailVali.test(emailAdd.value)==false) {
        emailAddMsg.innerText="email address cannot not matched";
    } else {
        emailAddMsg.innerText="";
    }
}

function checkPwdLength(pwd) {
    var pwdMsg = document.getElementById("pwdMsg");

    if(pwd.value.length<6 || pwd.value.length>12) {
        // window.alert("pwd range shoule be 6 to 12");
        pwdMsg.innerText="pwd range shoule be 6 to 12";
    } else {
        pwdMsg.innerText="";
    }
}

function checkPwdConf(pwdConf) {
    var pwd = document.getElementById("pwd");
    var pwdMsg = document.getElementById("pwdMsg");
    var pwdConfMsg = document.getElementById("pwdConfMsg");

    if(pwd.value != pwdConf.value) {
        // window.alert("two pwd does not match");
        pwdMsg.innerText="two pwd does not match";
        pwdConfMsg.innerText="two pwd does not match";
    } else {
        pwdMsg.innerText="";
        pwdConfMsg.innerText="";
    }
}
