package com.kieronquinn.app.darq.preferences

import android.content.Context
import android.util.AttributeSet
import android.widget.Switch
import androidx.core.content.res.ResourcesCompat
import androidx.preference.PreferenceViewHolder
import androidx.preference.SwitchPreference
import com.kieronquinn.app.darq.R
import android.widget.TextView
import androidx.preference.SwitchPreferenceCompat


class SwitchPreference : SwitchPreferenceCompat{

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(
        context,
        attrs,
        defStyleAttr,
        defStyleRes
    )

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context) : super(context) {}

    override fun onBindViewHolder(holder: PreferenceViewHolder?) {
        super.onBindViewHolder(holder)
        val titleView = holder?.findViewById(android.R.id.title) as TextView
        titleView.typeface = ResourcesCompat.getFont(context, R.font.hkgrotesk)
    }

}