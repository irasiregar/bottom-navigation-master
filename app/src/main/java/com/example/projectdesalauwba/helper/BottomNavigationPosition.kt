//package com.example.projectdesalauwba.helper
//
//import android.support.v4.app.Fragment
//import com.example.projectdesalauwba.R
//import com.example.projectdesalauwba.ui.DashboardFragment
//import com.example.projectdesalauwba.ui.HomeFragment
//import com.example.projectdesalauwba.ui.ProfilFragment
//import com.example.projectdesalauwba.ui.LainnyaFragment
//
//enum class BottomNavigationPosition(val position: Int, val id: Int) {
//    HOME(0, R.id.home),
//    PENGADUAN(1, R.id.pengaduan),
//    PROFIL(2, R.id.profil),
//    LAINNYA(3, R.id.lainnya);
//}
//
//fun findNavigationPositionById(id: Int): BottomNavigationPosition = when (id) {
//    BottomNavigationPosition.HOME.id -> BottomNavigationPosition.HOME
//    BottomNavigationPosition.PENGADUAN.id -> BottomNavigationPosition.PENGADUAN
//    BottomNavigationPosition.PROFIL.id -> BottomNavigationPosition.PROFIL
//    BottomNavigationPosition.LAINNYA.id -> BottomNavigationPosition.LAINNYA
//    else -> BottomNavigationPosition.HOME
//}
//
////fun BottomNavigationPosition.createFragment(): Fragment = when (this) {
//    BottomNavigationPosition.HOME -> HomeFragment.newInstance()
//   // BottomNavigationPosition.PENGADUAN -> DashboardFragment.newInstance()
//    BottomNavigationPosition.PROFIL -> ProfilFragment.newInstance()
//    //BottomNavigationPosition.LAINNYA -> LainnyaFragment.newInstance()
//}
//
//fun BottomNavigationPosition.getTag(): String = when (this) {
//    BottomNavigationPosition.HOME -> HomeFragment.TAG
//    BottomNavigationPosition.PENGADUAN -> DashboardFragment.TAG
//    BottomNavigationPosition.PROFIL -> ProfilFragment.TAG
//    BottomNavigationPosition.LAINNYA -> LainnyaFragment.TAG
//}
//
