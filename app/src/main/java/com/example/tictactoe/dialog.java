package com.example.tictactoe;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class dialog extends AppCompatDialogFragment {
    EditText player1_name,player2_name;
    dialogListener listener;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_box,null);
        builder.setView(view)
                .setTitle("Enter players name")
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(player1_name == null && player2_name == null){
                            String player1 = "Player 1 (X) : 0";
                            String player2 = "Player 2 (O) : 0";
                            listener.applyText(player1,player2);
                        }else{
                            String player1 = player1_name.getText().toString();
                            String player2 = player2_name.getText().toString();
                            listener.applyText(player1,player2);
                        }

                    }
                });

        player1_name = view.findViewById(R.id.d_player_1);
        player2_name = view.findViewById(R.id.d_player_2);
        return builder.create();
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listener = (dialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "must implement dialoglistener");
        }
    }

    public interface dialogListener{
        void applyText(String player1, String player2);
    }
}
