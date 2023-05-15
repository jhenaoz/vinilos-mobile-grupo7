package co.misw4203.grupo7.vinilos.repositories;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lco/misw4203/grupo7/vinilos/repositories/PerformerRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "refreshDataBandById", "Lco/misw4203/grupo7/vinilos/models/Band;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshDataBands", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshDataMusicianById", "Lco/misw4203/grupo7/vinilos/models/Musician;", "refreshDataMusicians", "app_debug"})
public final class PerformerRepository {
    @org.jetbrains.annotations.NotNull
    private final android.app.Application application = null;
    
    public PerformerRepository(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.Application getApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object refreshDataMusicians(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<co.misw4203.grupo7.vinilos.models.Musician>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object refreshDataBands(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<co.misw4203.grupo7.vinilos.models.Band>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object refreshDataMusicianById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super co.misw4203.grupo7.vinilos.models.Musician> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object refreshDataBandById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super co.misw4203.grupo7.vinilos.models.Band> $completion) {
        return null;
    }
}