package com.example.navigationbreakingapplication.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.navigationbreakingapplication.data.Character
import com.example.navigationbreakingapplication.databinding.FragmentHomeBinding
import org.json.JSONArray
import org.json.JSONObject

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private var url = ""
    private var characterList = mutableListOf<Character>()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        loadCharacter()
        super.onActivityCreated(savedInstanceState)
    }

    private fun loadCharacter() {
        var requestQueue = Volley.newRequestQueue(view?.context)
        url = "https://www.breakingbadapi.com/api/characters"
        characterList.clear()

        val stringRequest = StringRequest(Request.Method.GET, url, Response.Listener<String>{response ->
            val jsonArray = JSONArray(response)
            for(i in 0 until  jsonArray.length()){
                var jsonObject = JSONObject(jsonArray.getString(i))
                var characterRow = (
                        jsonObject.get("").toString()
                        )
            }
        }, Response.ErrorListener {
            error ->
        })

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}