package co.misw4203.grupo7.vinilos.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lco/misw4203/grupo7/vinilos/viewmodels/AlbumViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_albums", "Landroidx/lifecycle/MutableLiveData;", "", "Lco/misw4203/grupo7/vinilos/models/Album;", "_eventNetworkError", "", "_isNetworkErrorShown", "albumRepository", "Lco/misw4203/grupo7/vinilos/repositories/AlbumRepository;", "albums", "Landroidx/lifecycle/LiveData;", "getAlbums", "()Landroidx/lifecycle/LiveData;", "eventNetworkError", "getEventNetworkError", "isNetworkErrorShown", "onNetworkErrorShown", "", "refreshDataFromNetwork", "Factory", "app_debug"})
public final class AlbumViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<co.misw4203.grupo7.vinilos.models.Album>> _albums = null;
    @org.jetbrains.annotations.NotNull
    private final co.misw4203.grupo7.vinilos.repositories.AlbumRepository albumRepository = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _eventNetworkError;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isNetworkErrorShown;
    
    public AlbumViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<co.misw4203.grupo7.vinilos.models.Album>> getAlbums() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEventNetworkError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isNetworkErrorShown() {
        return null;
    }
    
    private final void refreshDataFromNetwork() {
    }
    
    public final void onNetworkErrorShown() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lco/misw4203/grupo7/vinilos/viewmodels/AlbumViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApp", "()Landroid/app/Application;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull
        private final android.app.Application app = null;
        
        public Factory(@org.jetbrains.annotations.NotNull
        android.app.Application app) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.app.Application getApp() {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}