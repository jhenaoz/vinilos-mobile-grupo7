package co.misw4203.grupo7.vinilos.databinding;
import co.misw4203.grupo7.vinilos.R;
import co.misw4203.grupo7.vinilos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DetailPerformerActivityBindingImpl extends DetailPerformerActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.albumsRv, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DetailPerformerActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private DetailPerformerActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.descriptionPerformer.setTag(null);
        this.imageView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.titlePerformer.setTag(null);
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
        if (BR.performer == variableId) {
            setPerformer((co.misw4203.grupo7.vinilos.models.Performer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPerformer(@Nullable co.misw4203.grupo7.vinilos.models.Performer Performer) {
        this.mPerformer = Performer;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.performer);
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
        java.lang.String performerImage = null;
        java.lang.String performerName = null;
        co.misw4203.grupo7.vinilos.models.Performer performer = mPerformer;
        java.lang.String performerDescription = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (performer != null) {
                    // read performer.image
                    performerImage = performer.getImage();
                    // read performer.name
                    performerName = performer.getName();
                    // read performer.description
                    performerDescription = performer.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descriptionPerformer, performerDescription);
            co.misw4203.grupo7.vinilos.BindingAdaptersKt.bindImage(this.imageView, performerImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titlePerformer, performerName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): performer
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}