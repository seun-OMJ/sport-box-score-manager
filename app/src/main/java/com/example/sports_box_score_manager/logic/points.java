package com.example.sports_box_score_manager.logic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.sports_box_score_manager.R;
import com.example.sports_box_score_manager.databinding.FragmentFirstBinding;
import com.example.sports_box_score_manager.databinding.FragmentSecond2Binding;
import com.example.sports_box_score_manager.databinding.FragmentSecondBinding;

public class points {
    public static void add(int score){
        score++;
    }
    public static void subtract(int score){
        score--;
    }

    public static class FirstFragment extends Fragment {

        private FragmentFirstBinding binding;

        @Override
        public View onCreateView(
                LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState
        ) {

            binding = FragmentFirstBinding.inflate(inflater, container, false);
            return binding.getRoot();

        }

        public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

            binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    NavHostFragment.findNavController(FirstFragment.this)
                            .navigate(R.id.action_FirstFragment_to_SecondFragment);
                }
            });
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            binding = null;
        }

    }

    public static class Second2Fragment extends Fragment {

        private FragmentSecond2Binding binding;

        @Override
        public View onCreateView(
                LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState
        ) {

            binding = FragmentSecond2Binding.inflate(inflater, container, false);
            return binding.getRoot();

        }

        public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

            binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    NavHostFragment.findNavController(Second2Fragment.this)
                            .navigate(R.id.action_Second2Fragment_to_First2Fragment);
                }
            });
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            binding = null;
        }

    }

    public static class SecondFragment extends Fragment {

        private FragmentSecondBinding binding;

        @Override
        public View onCreateView(
                LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState
        ) {

            binding = FragmentSecondBinding.inflate(inflater, container, false);
            return binding.getRoot();

        }

        public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

            binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_to_FirstFragment);
                }
            });
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            binding = null;
        }

    }
}
