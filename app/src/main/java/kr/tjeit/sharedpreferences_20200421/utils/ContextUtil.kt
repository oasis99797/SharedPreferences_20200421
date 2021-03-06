package kr.tjeit.sharedpreferences_20200421.utils

import android.content.Context

class ContextUtil {

//    JAVA의 static 변수/메쏘드에 해당하는 코드들을 적는 영역
    companion object {

//      메모장의 파일명에 대응되는 개념.
        private val prefName = "MyPref" // 프로젝트별로 맞는 이름으로 작명.
//      메모장에 저장될 항목의 이름.
        private val USER_ID = "USER_ID"
        private val ID_SAVE = "ID_SAVE"

//    setter : 데이터 저장용 함수
        fun setUserId (context:Context, inputId:String) {
//            메모장 파일을 여는것과 비슷한 행위.
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
//            USER_ID 항목에 함수의 재료로 들어오는 String 변수 저장.
            pref.edit().putString(USER_ID, inputId).apply()
        }

//    getter : 저장된 데이터 조회용 함수
        fun getUserId (context:Context) : String {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getString(USER_ID, "")!!

        }

        fun setSaveId(context: Context, isSave:Boolean) {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putBoolean(ID_SAVE, isSave).apply()
        }

        fun getSaveId(context: Context) : Boolean {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getBoolean(ID_SAVE, false)
        }



    }

}