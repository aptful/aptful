// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
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

public final class Signup3Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView IDEditSignupText;

  @NonNull
  public final TextView IDSignupText;

  @NonNull
  public final ImageView backButton;

  @NonNull
  public final TextView birthdayEditSignupText;

  @NonNull
  public final TextView birthdaySinupText;

  @NonNull
  public final Button btnOK;

  @NonNull
  public final CheckBox checkBox;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView keywordText;

  @NonNull
  public final TextView looksignupText;

  @NonNull
  public final TextView passwordEditSignupText;

  @NonNull
  public final TextView passwordSignupText;

  @NonNull
  public final TextView ruleText;

  @NonNull
  public final Button rulrButton;

  @NonNull
  public final TextView signupOneLabel;

  private Signup3Binding(@NonNull LinearLayout rootView, @NonNull TextView IDEditSignupText,
      @NonNull TextView IDSignupText, @NonNull ImageView backButton,
      @NonNull TextView birthdayEditSignupText, @NonNull TextView birthdaySinupText,
      @NonNull Button btnOK, @NonNull CheckBox checkBox, @NonNull ImageView imageView,
      @NonNull TextView keywordText, @NonNull TextView looksignupText,
      @NonNull TextView passwordEditSignupText, @NonNull TextView passwordSignupText,
      @NonNull TextView ruleText, @NonNull Button rulrButton, @NonNull TextView signupOneLabel) {
    this.rootView = rootView;
    this.IDEditSignupText = IDEditSignupText;
    this.IDSignupText = IDSignupText;
    this.backButton = backButton;
    this.birthdayEditSignupText = birthdayEditSignupText;
    this.birthdaySinupText = birthdaySinupText;
    this.btnOK = btnOK;
    this.checkBox = checkBox;
    this.imageView = imageView;
    this.keywordText = keywordText;
    this.looksignupText = looksignupText;
    this.passwordEditSignupText = passwordEditSignupText;
    this.passwordSignupText = passwordSignupText;
    this.ruleText = ruleText;
    this.rulrButton = rulrButton;
    this.signupOneLabel = signupOneLabel;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Signup3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Signup3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.signup3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Signup3Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ID_edit_signupText;
      TextView IDEditSignupText = ViewBindings.findChildViewById(rootView, id);
      if (IDEditSignupText == null) {
        break missingId;
      }

      id = R.id.ID_signupText;
      TextView IDSignupText = ViewBindings.findChildViewById(rootView, id);
      if (IDSignupText == null) {
        break missingId;
      }

      id = R.id.backButton;
      ImageView backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.birthday_edit_signupText;
      TextView birthdayEditSignupText = ViewBindings.findChildViewById(rootView, id);
      if (birthdayEditSignupText == null) {
        break missingId;
      }

      id = R.id.birthday_sinupText;
      TextView birthdaySinupText = ViewBindings.findChildViewById(rootView, id);
      if (birthdaySinupText == null) {
        break missingId;
      }

      id = R.id.btnOK;
      Button btnOK = ViewBindings.findChildViewById(rootView, id);
      if (btnOK == null) {
        break missingId;
      }

      id = R.id.checkBox;
      CheckBox checkBox = ViewBindings.findChildViewById(rootView, id);
      if (checkBox == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.keywordText;
      TextView keywordText = ViewBindings.findChildViewById(rootView, id);
      if (keywordText == null) {
        break missingId;
      }

      id = R.id.looksignupText;
      TextView looksignupText = ViewBindings.findChildViewById(rootView, id);
      if (looksignupText == null) {
        break missingId;
      }

      id = R.id.password_edit_signupText;
      TextView passwordEditSignupText = ViewBindings.findChildViewById(rootView, id);
      if (passwordEditSignupText == null) {
        break missingId;
      }

      id = R.id.password_signupText;
      TextView passwordSignupText = ViewBindings.findChildViewById(rootView, id);
      if (passwordSignupText == null) {
        break missingId;
      }

      id = R.id.ruleText;
      TextView ruleText = ViewBindings.findChildViewById(rootView, id);
      if (ruleText == null) {
        break missingId;
      }

      id = R.id.rulrButton;
      Button rulrButton = ViewBindings.findChildViewById(rootView, id);
      if (rulrButton == null) {
        break missingId;
      }

      id = R.id.signupOneLabel;
      TextView signupOneLabel = ViewBindings.findChildViewById(rootView, id);
      if (signupOneLabel == null) {
        break missingId;
      }

      return new Signup3Binding((LinearLayout) rootView, IDEditSignupText, IDSignupText, backButton,
          birthdayEditSignupText, birthdaySinupText, btnOK, checkBox, imageView, keywordText,
          looksignupText, passwordEditSignupText, passwordSignupText, ruleText, rulrButton,
          signupOneLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
