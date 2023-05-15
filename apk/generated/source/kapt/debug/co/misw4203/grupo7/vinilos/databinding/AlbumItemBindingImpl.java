package co.misw4203.grupo7.vinilos.databinding;
import co.misw4203.grupo7.vinilos.R;
import co.misw4203.grupo7.vinilos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AlbumItemBindingImpl extends AlbumItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AlbumItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private AlbumItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.albumImageView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.album == variableId) {
            setAlbum((co.misw4203.grupo7.vinilos.models.Album) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAlbum(@Nullable co.misw4203.grupo7.vinilos.models.Album Album) {
        this.mAlbum = Album;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.album);
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
        java.lang.String albumName = null;
        co.misw4203.grupo7.vinilos.models.Album album = mAlbum;
        java.lang.String albumCover = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (album != null) {
                    // read album.name
                    albumName = album.getName();
                    // read album.cover
                    albumCover = album.getCover();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            co.misw4203.grupo7.vinilos.BindingAdaptersKt.bindImage(this.albumImageView, albumCover);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView5, albumName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): album
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}