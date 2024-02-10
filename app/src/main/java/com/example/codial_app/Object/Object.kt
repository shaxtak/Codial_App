package com.example.codial_app.Object

import com.example.codial_app.models.Courses
import com.example.codial_app.models.Groups
import com.example.codial_app.models.Mentors
import com.example.codial_app.models.Students

object Object {
    var tvAllCoursesName = ""
    var booleanAddCourses = true
    var courses = Courses()
    var mentors = Mentors()
    var groups = Groups()
    var students = Students()
    var navigationID = 0
    var editStudent = false
}