/* eslint-disable jsx-a11y/anchor-is-valid */
import React from 'react'
import { Link } from 'react-router-dom'

export default function Navbar() {
  return (
    <div>

<nav className="navbar navbar-expand-lg navbar-light navbar-dark bg-primary">
    <div className='container-fluid'>
  <a className="navbar-brand" href="#">CRUD Full Stack Application Menon</a>
  <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span className="navbar-toggler-icon"></span>
  </button>
    </div>
  <Link className='btn btn-outline-light' to='/addUser'>Add User</Link>
</nav>
    </div>
  )
}
