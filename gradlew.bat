package com.desire.talenthunt.databinding;
import com.desire.talenthunt.R;
import com.desire.talenthunt.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.topView, 1);
        sViewsWithIds.put(R.id.userProfileIv, 2);
        sViewsWithIds.put(R.id.userNameET, 3);
        sViewsWithIds.put(R.id.userEmailET, 4);
        sViewsWithIds.put(R.id.userMobileEt, 5);
        sViewsWithIds.put(R.id.userGenderEt, 6);
        sViewsWithIds.put(R.id.userDOBEt, 7);
        sViewsWithIds.put(R.id.userHeightEt, 8);
        sViewsWithIds.put(R.id.userAddressEt, 9);
        sViewsWithIds.put(R.id.userAboutEt, 10);
        sViewsWithIds.put(R.id.saveProfileBtn, 11);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[11]
            , (android.view.View) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[10]
            , (com.google.android.material.textfield.TextInputEditText) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.google.android.material.textfield.TextInp