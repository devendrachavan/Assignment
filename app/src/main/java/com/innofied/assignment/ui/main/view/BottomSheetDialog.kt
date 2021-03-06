package com.innofied.assignment.ui.main.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.innofied.assignment.R
import com.innofied.assignment.data.model.User

class BottomSheetDialog(private val user: User) : BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.bottom_sheet_layout, container, false)

        val imageViewAvatar = v.findViewById<ImageView>(R.id.imageViewAvatar)
        v.findViewById<TextView>(R.id.textViewUserID).text = "Id - ${user.id}"
        v.findViewById<TextView>(R.id.textViewUserName).text = user.getName()
        v.findViewById<TextView>(R.id.textViewUserEmail).text = "Email - ${user.email}"

        Glide.with(imageViewAvatar.context)
            .load(user.avatar)
            .apply(RequestOptions.circleCropTransform())
            .into(imageViewAvatar)

        return v
    }
}