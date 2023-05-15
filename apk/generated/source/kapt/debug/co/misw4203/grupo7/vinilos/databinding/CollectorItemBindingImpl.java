package co.misw4203.grupo7.vinilos.databinding;
import co.misw4203.grupo7.vinilos.R;
import co.misw4203.grupo7.vinilos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CollectorItemBindingImpl extends CollectorItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CollectorItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private CollectorItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.text6.setTag(null);
        this.text7.setTag(null);
        this.textView5.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.collector == variableId) {
            setCollector((co.misw4203.grupo7.vinilos.models.Collector) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCollector(@Nullable co.misw4203.grupo7.vinilos.models.Collector Collector) {
        this.mCollector = Collector;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.collector);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String collectorName = null;
        co.misw4203.grupo7.vinilos.models.Collector collector = mCollector;
        java.lang.String collectorEmail = null;
        java.lang.String collectorTelephone = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (collector != null) {
                    // read collector.name
                    collectorName = collector.getName();
                    // read collector.email
                    collectorEmail = collector.getEmail();
                    // read collector.telephone
                    collectorTelephone = collector.getTelephone();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text6, collectorEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text7, collectorTelephone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView5, collectorName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): collector
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}