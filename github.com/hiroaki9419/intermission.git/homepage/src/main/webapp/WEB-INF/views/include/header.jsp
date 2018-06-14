<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style>

*{
    margin: 0px;
    padding: 0px;
}
 
.main_box {
	background-color: gray;
    width: 100%;
    height: 60px;
    margin: 0 auto;
	text-align: center;
}
.common {
    display: inline-table;
    height:40px;
    position: relative;
    top: 10px;
    font-size: 20px;
}

.logo {
	left: 10px;
    font-size: 30px;
    font-weight: bolder;
    float: left;
}

.searchText{
width: 70%;
}

.searchButton{
background-color: #555555;
    border: none;
    color: white;
    padding: 10px 10px;
    right: 10px;
    text-align: center;
    text-decoration: none;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    border-radius: 12px;
}


.sign {
	float: right;
}

.login {
    float: right;
}
.button{
    background-color: #555555;
    border: none;
    color: white;
    padding: 10px 32px;
    right: 10px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    width: 100px;
    top: 6px;
}

</style>

<div class="main_box">
    <div class="logo common">INTERMISSION</div>
  
  
  <div class="search common">
      <input type="text" class="searchText" placeholder="Search...">
      <input type="submit" class="searchButton" value="submit"></input>
</div>
  
  
    <button class="login common button" href="#">Login</button>
    <button class="sign common button" href="#">Join</button>

</div>

