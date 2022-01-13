// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
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

public final class NewscouponscreenBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button allButton;

  @NonNull
  public final ImageButton couponButton;

  @NonNull
  public final TextView couponText;

  @NonNull
  public final TextView couponText2;

  @NonNull
  public final TextView couponText3;

  @NonNull
  public final TextView couponText4;

  @NonNull
  public final TextView couponText5;

  @NonNull
  public final TextView effectText;

  @NonNull
  public final TextView effectText2;

  @NonNull
  public final TextView effectText3;

  @NonNull
  public final TextView effectText4;

  @NonNull
  public final TextView effectText5;

  @NonNull
  public final ImageButton homeButton;

  @NonNull
  public final ImageView imageframe;

  @NonNull
  public final Button keywordButton;

  @NonNull
  public final TextView keywordScreenText;

  @NonNull
  public final View lineOrange;

  @NonNull
  public final View orangeLine;

  @NonNull
  public final View orangeLine2;

  @NonNull
  public final View orangeLine3;

  @NonNull
  public final View orangeLine4;

  @NonNull
  public final View orangeLine5;

  private NewscouponscreenBinding(@NonNull LinearLayout rootView, @NonNull Button allButton,
      @NonNull ImageButton couponButton, @NonNull TextView couponText,
      @NonNull TextView couponText2, @NonNull TextView couponText3, @NonNull TextView couponText4,
      @NonNull TextView couponText5, @NonNull TextView effectText, @NonNull TextView effectText2,
      @NonNull TextView effectText3, @NonNull TextView effectText4, @NonNull TextView effectText5,
      @NonNull ImageButton homeButton, @NonNull ImageView imageframe, @NonNull Button keywordButton,
      @NonNull TextView keywordScreenText, @NonNull View lineOrange, @NonNull View orangeLine,
      @NonNull View orangeLine2, @NonNull View orangeLine3, @NonNull View orangeLine4,
      @NonNull View orangeLine5) {
    this.rootView = rootView;
    this.allButton = allButton;
    this.couponButton = couponButton;
    this.couponText = couponText;
    this.couponText2 = couponText2;
    this.couponText3 = couponText3;
    this.couponText4 = couponText4;
    this.couponText5 = couponText5;
    this.effectText = effectText;
    this.effectText2 = effectText2;
    this.effectText3 = effectText3;
    this.effectText4 = effectText4;
    this.effectText5 = effectText5;
    this.homeButton = homeButton;
    this.imageframe = imageframe;
    this.keywordButton = keywordButton;
    this.keywordScreenText = keywordScreenText;
    this.lineOrange = lineOrange;
    this.orangeLine = orangeLine;
    this.orangeLine2 = orangeLine2;
    this.orangeLine3 = orangeLine3;
    this.orangeLine4 = orangeLine4;
    this.orangeLine5 = orangeLine5;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NewscouponscreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NewscouponscreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.newscouponscreen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NewscouponscreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.allButton;
      Button allButton = ViewBindings.findChildViewById(rootView, id);
      if (allButton == null) {
        break missingId;
      }

      id = R.id.couponButton;
      ImageButton couponButton = ViewBindings.findChildViewById(rootView, id);
      if (couponButton == null) {
        break missingId;
      }

      id = R.id.couponText;
      TextView couponText = ViewBindings.findChildViewById(rootView, id);
      if (couponText == null) {
        break missingId;
      }

      id = R.id.couponText2;
      TextView couponText2 = ViewBindings.findChildViewById(rootView, id);
      if (couponText2 == null) {
        break missingId;
      }

      id = R.id.couponText3;
      TextView couponText3 = ViewBindings.findChildViewById(rootView, id);
      if (couponText3 == null) {
        break missingId;
      }

      id = R.id.couponText4;
      TextView couponText4 = ViewBindings.findChildViewById(rootView, id);
      if (couponText4 == null) {
        break missingId;
      }

      id = R.id.couponText5;
      TextView couponText5 = ViewBindings.findChildViewById(rootView, id);
      if (couponText5 == null) {
        break missingId;
      }

      id = R.id.effectText;
      TextView effectText = ViewBindings.findChildViewById(rootView, id);
      if (effectText == null) {
        break missingId;
      }

      id = R.id.effectText2;
      TextView effectText2 = ViewBindings.findChildViewById(rootView, id);
      if (effectText2 == null) {
        break missingId;
      }

      id = R.id.effectText3;
      TextView effectText3 = ViewBindings.findChildViewById(rootView, id);
      if (effectText3 == null) {
        break missingId;
      }

      id = R.id.effectText4;
      TextView effectText4 = ViewBindings.findChildViewById(rootView, id);
      if (effectText4 == null) {
        break missingId;
      }

      id = R.id.effectText5;
      TextView effectText5 = ViewBindings.findChildViewById(rootView, id);
      if (effectText5 == null) {
        break missingId;
      }

      id = R.id.homeButton;
      ImageButton homeButton = ViewBindings.findChildViewById(rootView, id);
      if (homeButton == null) {
        break missingId;
      }

      id = R.id.imageframe;
      ImageView imageframe = ViewBindings.findChildViewById(rootView, id);
      if (imageframe == null) {
        break missingId;
      }

      id = R.id.keywordButton;
      Button keywordButton = ViewBindings.findChildViewById(rootView, id);
      if (keywordButton == null) {
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

      id = R.id.orangeLine;
      View orangeLine = ViewBindings.findChildViewById(rootView, id);
      if (orangeLine == null) {
        break missingId;
      }

      id = R.id.orangeLine2;
      View orangeLine2 = ViewBindings.findChildViewById(rootView, id);
      if (orangeLine2 == null) {
        break missingId;
      }

      id = R.id.orangeLine3;
      View orangeLine3 = ViewBindings.findChildViewById(rootView, id);
      if (orangeLine3 == null) {
        break missingId;
      }

      id = R.id.orangeLine4;
      View orangeLine4 = ViewBindings.findChildViewById(rootView, id);
      if (orangeLine4 == null) {
        break missingId;
      }

      id = R.id.orangeLine5;
      View orangeLine5 = ViewBindings.findChildViewById(rootView, id);
      if (orangeLine5 == null) {
        break missingId;
      }

      return new NewscouponscreenBinding((LinearLayout) rootView, allButton, couponButton,
          couponText, couponText2, couponText3, couponText4, couponText5, effectText, effectText2,
          effectText3, effectText4, effectText5, homeButton, imageframe, keywordButton,
          keywordScreenText, lineOrange, orangeLine, orangeLine2, orangeLine3, orangeLine4,
          orangeLine5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
