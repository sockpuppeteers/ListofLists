package comsockpuppeteers.httpsgithub.businesslayer

import android.app.Activity

abstract class ListofLists(val name: String)
{
}

class FirstList() : ListofLists("FirstList")
{
    val mlist: MutableList<String> = mutableListOf()

    fun AddList(name: String)
    {
        mlist.add(name)
    }

    fun DeleteList(name: String)
    {
        mlist.remove(name)
    }

    fun PrintList(): String
    {
        var s = ""
        for (item in mlist)
        {
            s = s + item + "\n"
        }

        return s
    }
}