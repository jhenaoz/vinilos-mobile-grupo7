package co.misw4203.grupo7.vinilos.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lco/misw4203/grupo7/vinilos/viewmodels/DetailAlbumViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "id", "", "(Landroid/app/Application;I)V", "_album", "Landroidx/lifecycle/MutableLiveData;", "Lco/misw4203/grupo7/vinilos/models/Album;", "_eventNetworkError", "", "_isNetworkErrorShown", "album", "Landroidx/lifecycle/LiveData;", "getAlbum", "()Landroidx/lifecycle/LiveData;", "albumRepository", "Lco/misw4203/grupo7/vinilos/repositories/AlbumRepository;", "eventNetworkError", "getEventNetworkError", "getId", "()I", "isNetworkErrorShown", "onNetworkErrorShown", "", "refreshDataFromNetwork", "Factory", "app_debug"})
public final class DetailAlbumViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<co.misw4203.grupo7.vinilos.models.Album> _album = null;
    @org.jetbrains.annotations.NotNull
    private final co.misw4203.grupo7.vinilos.repositories.AlbumRepository albumRepository = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _eventNetworkError;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isNetworkErrorShown;
    private final int id = 0;
    
    public DetailAlbumViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, int id) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<co.misw4203.grupo7.vinilos.models.Album> getAlbum() {
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
    
    public final int getId() {
        return 0;
    }
    
    private final void refreshDataFromNetwork() {
    }
    
    public final void onNetworkErrorShown() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lco/misw4203/grupo7/vinilos/viewmodels/DetailAlbumViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "app", "Landroid/app/Application;", "id", "", "(Landroid/app/Application;I)V", "getApp", "()Landroid/app/Application;", "getId", "()I", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull
        private final android.app.Application app = null;
        private final int id = 0;
        
        public Factory(@org.jetbrains.annotations.NotNull
        android.app.Application app, int id) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.app.Application getApp() {
            return null;
        }
        
        public final int getId() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}