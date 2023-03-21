package com.example.labb2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar


class BlankFragment4 : Fragment() {

    private val countViewModel: Countviewmodel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_blank4, container, false)
        //val counterTextView : TextView = view.findViewById(R.id.textView8)
        val incrementButton: Button = view.findViewById(R.id.button9)


view.findViewById<TextView>(R.id.textView8).text = "${countViewModel.count}"

        incrementButton.setOnClickListener {
            countViewModel.count++
            view.findViewById<TextView>(R.id.textView8).text = "${countViewModel.count}"

        }
    val emailList = ArrayList<String>()
        val emailInput: EditText = view.findViewById(R.id.Edittext)
        val submitButton: Button = view.findViewById(R.id.button7)
        //val coordinatorLayout: CoordinatorLayout = view.findViewById(R.id.coordinator_layout)
        submitButton.setOnClickListener {
            val newEmail = emailInput.text.toString()
            emailList.add(newEmail)

            Snackbar.make(view, "Email added: $newEmail", Snackbar.LENGTH_LONG)
                .setAction("UNDO") {

                    emailList.remove(newEmail)
                    println(emailList)
                    Snackbar.make(
                        view,
                        "Email removed: $newEmail",
                        Snackbar.LENGTH_SHORT
                    ).show()
                }
                .show()
            println(emailList)
            emailInput.text.clear()
        }




        view.findViewById<Button>(R.id.button8).setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_blankFragment4_to_blankFragment)


        }

        return view
    }


}



