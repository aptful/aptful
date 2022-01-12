// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class WithdrawalshowBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText IDEdit;

  @NonNull
  public final TextView IDText;

  @NonNull
  public final TextView PasswordText;

  @NonNull
  public final ImageButton buckButton;

  @NonNull
  public final ImageButton homeButton;

  @NonNull
  public final TextView keywordScreenText;

  @NonNull
  public final View lineOrange;

  @NonNull
  public final EditText passwordEdit;

  @NonNull
  public final Button withdrawalbutton;

  private WithdrawalshowBinding(@NonNull LinearLayout rootView, @NonNull EditText IDEdit,
      @NonNull TextView IDText, @NonNull TextView PasswordText, @NonNull ImageButton buckButton,
      @NonNull ImageButton homeButton, @NonNull TextView keywordScreenText,
      @NonNull View lineOrange, @NonNull EditText passwordEdit, @NonNull Button withdrawalbutton) {
    this.rootView = rootView;
    this.IDEdit = IDEdit;
    this.IDText = IDText;
    this.PasswordText = PasswordText;
    this.buckButton = buckButton;
    this.homeButton = homeButton;
    this.keywordScreenText = keywordScreenText;
    this.lineOrange = lineOrange;
    this.passwordEdit = passwordEdit;
    this.withdrawalbutton = withdrawalbutton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WithdrawalshowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WithdrawalshowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.withdrawalshow, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WithdrawalshowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.IDEdit;
      EditText IDEdit = ViewBindings.findChildViewById(rootView, id);
      if (IDEdit == null) {
        break missingId;
      }

      id = R.id.IDText;
      TextView IDText = ViewBindings.findChildViewById(rootView, id);
      if (IDText == null) {
        break missingId;
      }

      id = R.id.PasswordText;
      TextView PasswordText = ViewBindings.findChildViewById(rootView, id);
      if (PasswordText == null) {
        break missingId;
      }

      id = R.id.buckButton;
      ImageButton buckButton = ViewBindings.findChildViewById(rootView, id);
      if (buckButton == null) {
        break missingId;
      }

      id = R.id.homeButton;
      ImageButton homeButton = ViewBindings.findChildViewById(rootView, id);
      if (homeButton == null) {
        break missingId;
      }

      id = R.id.keywordScreenText;
      TextView keywordScreenText = ViewBindings.findChildViewById(rootView, id);
      if (keywordScreenText == null) {
        break missingId;
      }

      id = R.id.line_orange;
      View lineOrange = ViewBindings.findChildViewById(rootView, id);
      if (lineOrange == null) {
        break missingId;
      }

      id = R.id.passwordEdit;
      EditText passwordEdit = ViewBindings.findChildViewById(rootView, id);
      if (passwordEdit == null) {
        break missingId;
      }

      id = R.id.withdrawalbutton;
      Button withdrawalbutton = ViewBindings.findChildViewById(rootView, id);
      if (withdrawalbutton == null) {
        break missingId;
      }

      return new WithdrawalshowBinding((LinearLayout) rootView, IDEdit, IDText, PasswordText,
          buckButton, homeButton, keywordScreenText, lineOrange, passwordEdit, withdrawalbutton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}