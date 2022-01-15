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

public final class NewskeywordscreenBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button allButton;

  @NonNull
  public final Button contentsText1;

  @NonNull
  public final Button contentsText2;

  @NonNull
  public final Button contentsText3;

  @NonNull
  public final Button contentsText4;

  @NonNull
  public final Button contentsText5;

  @NonNull
  public final Button couponButton;

  @NonNull
  public final ImageButton homeButton;

  @NonNull
  public final ImageView imageframe;

  @NonNull
  public final ImageButton keywordButton;

  @NonNull
  public final TextView keywordText1;

  @NonNull
  public final TextView keywordText2;

  @NonNull
  public final TextView keywordText3;

  @NonNull
  public final TextView keywordText4;

  @NonNull
  public final TextView keywordText5;

  @NonNull
  public final View lineOrange;

  @NonNull
  public final TextView newsText;

  @NonNull
  public final View orangeLine1;

  @NonNull
  public final View orangeLine2;

  @NonNull
  public final View orangeLine3;

  @NonNull
  public final View orangeLine4;

  @NonNull
  public final View orangeLine5;

  private NewskeywordscreenBinding(@NonNull LinearLayout rootView, @NonNull Button allButton,
      @NonNull Button contentsText1, @NonNull Button contentsText2, @NonNull Button contentsText3,
      @NonNull Button contentsText4, @NonNull Button contentsText5, @NonNull Button couponButton,
      @NonNull ImageButton homeButton, @NonNull ImageView imageframe,
      @NonNull ImageButton keywordButton, @NonNull TextView keywordText1,
      @NonNull TextView keywordText2, @NonNull TextView keywordText3,
      @NonNull TextView keywordText4, @NonNull TextView keywordText5, @NonNull View lineOrange,
      @NonNull TextView newsText, @NonNull View orangeLine1, @NonNull View orangeLine2,
      @NonNull View orangeLine3, @NonNull View orangeLine4, @NonNull View orangeLine5) {
    this.rootView = rootView;
    this.allButton = allButton;
    this.contentsText1 = contentsText1;
    this.contentsText2 = contentsText2;
    this.contentsText3 = contentsText3;
    this.contentsText4 = contentsText4;
    this.contentsText5 = contentsText5;
    this.couponButton = couponButton;
    this.homeButton = homeButton;
    this.imageframe = imageframe;
    this.keywordButton = keywordButton;
    this.keywordText1 = keywordText1;
    this.keywordText2 = keywordText2;
    this.keywordText3 = keywordText3;
    this.keywordText4 = keywordText4;
    this.keywordText5 = keywordText5;
    this.lineOrange = lineOrange;
    this.newsText = newsText;
    this.orangeLine1 = orangeLine1;
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
  public static NewskeywordscreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NewskeywordscreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.newskeywordscreen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NewskeywordscreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.allButton;
      Button allButton = ViewBindings.findChildViewById(rootView, id);
      if (allButton == null) {
        break missingId;
      }

      id = R.id.contentsText1;
      Button contentsText1 = ViewBindings.findChildViewById(rootView, id);
      if (contentsText1 == null) {
        break missingId;
      }

      id = R.id.contentsText2;
      Button contentsText2 = ViewBindings.findChildViewById(rootView, id);
      if (contentsText2 == null) {
        break missingId;
      }

      id = R.id.contentsText3;
      Button contentsText3 = ViewBindings.findChildViewById(rootView, id);
      if (contentsText3 == null) {
        break missingId;
      }

      id = R.id.contentsText4;
      Button contentsText4 = ViewBindings.findChildViewById(rootView, id);
      if (contentsText4 == null) {
        break missingId;
      }

      id = R.id.contentsText5;
      Button contentsText5 = ViewBindings.findChildViewById(rootView, id);
      if (contentsText5 == null) {
        break missingId;
      }

      id = R.id.couponButton;
      Button couponButton = ViewBindings.findChildViewById(rootView, id);
      if (couponButton == null) {
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
      ImageButton keywordButton = ViewBindings.findChildViewById(rootView, id);
      if (keywordButton == null) {
        break missingId;
      }

      id = R.id.keywordText1;
      TextView keywordText1 = ViewBindings.findChildViewById(rootView, id);
      if (keywordText1 == null) {
        break missingId;
      }

      id = R.id.keywordText2;
      TextView keywordText2 = ViewBindings.findChildViewById(rootView, id);
      if (keywordText2 == null) {
        break missingId;
      }

      id = R.id.keywordText3;
      TextView keywordText3 = ViewBindings.findChildViewById(rootView, id);
      if (keywordText3 == null) {
        break missingId;
      }

      id = R.id.keywordText4;
      TextView keywordText4 = ViewBindings.findChildViewById(rootView, id);
      if (keywordText4 == null) {
        break missingId;
      }

      id = R.id.keywordText5;
      TextView keywordText5 = ViewBindings.findChildViewById(rootView, id);
      if (keywordText5 == null) {
        break missingId;
      }

      id = R.id.line_orange;
      View lineOrange = ViewBindings.findChildViewById(rootView, id);
      if (lineOrange == null) {
        break missingId;
      }

      id = R.id.newsText;
      TextView newsText = ViewBindings.findChildViewById(rootView, id);
      if (newsText == null) {
        break missingId;
      }

      id = R.id.orangeLine1;
      View orangeLine1 = ViewBindings.findChildViewById(rootView, id);
      if (orangeLine1 == null) {
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

      return new NewskeywordscreenBinding((LinearLayout) rootView, allButton, contentsText1,
          contentsText2, contentsText3, contentsText4, contentsText5, couponButton, homeButton,
          imageframe, keywordButton, keywordText1, keywordText2, keywordText3, keywordText4,
          keywordText5, lineOrange, newsText, orangeLine1, orangeLine2, orangeLine3, orangeLine4,
          orangeLine5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
