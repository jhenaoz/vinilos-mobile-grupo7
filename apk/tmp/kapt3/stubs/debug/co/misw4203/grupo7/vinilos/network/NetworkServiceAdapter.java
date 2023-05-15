package co.misw4203.grupo7.vinilos.network;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 72\u00020\u0001:\u00017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012JR\u0010\u0019\u001a\u00020\u001a2\'\u0010\u001b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001d0\u0011\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001a0\u001c2!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\"\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u001a0\u001cJZ\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u000e2\'\u0010\u001b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020&0\u0011\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001a0\u001c2!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\"\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u001a0\u001cJ\u0019\u0010\'\u001a\u00020(2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J&\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00152\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150.2\u0006\u0010/\u001a\u000200H\u0002J\\\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u0002032\u0006\u0010%\u001a\u00020\u000e2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u001103\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001a0\u001c2!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\"\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u001a0\u001cJ.\u00104\u001a\u0002052\u0006\u0010,\u001a\u00020\u00152\u0006\u00102\u001a\u0002032\f\u0010-\u001a\b\u0012\u0004\u0012\u0002030.2\u0006\u0010/\u001a\u000200H\u0002J.\u00106\u001a\u0002052\u0006\u0010,\u001a\u00020\u00152\u0006\u00102\u001a\u0002032\f\u0010-\u001a\b\u0012\u0004\u0012\u0002030.2\u0006\u0010/\u001a\u000200H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00068"}, d2 = {"Lco/misw4203/grupo7/vinilos/network/NetworkServiceAdapter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "requestQueue", "Lcom/android/volley/RequestQueue;", "getRequestQueue", "()Lcom/android/volley/RequestQueue;", "requestQueue$delegate", "Lkotlin/Lazy;", "getAlbumById", "Lco/misw4203/grupo7/vinilos/models/Album;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlbums", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlbumsOfPerformers", "response", "", "getBandById", "Lco/misw4203/grupo7/vinilos/models/Band;", "getBands", "getCollectors", "", "onComplete", "Lkotlin/Function1;", "Lco/misw4203/grupo7/vinilos/models/Collector;", "Lkotlin/ParameterName;", "name", "resp", "onError", "Lcom/android/volley/VolleyError;", "error", "getComments", "albumId", "Lco/misw4203/grupo7/vinilos/models/Comment;", "getMusicianById", "Lco/misw4203/grupo7/vinilos/models/Musician;", "getMusicians", "getRequest", "Lcom/android/volley/toolbox/StringRequest;", "path", "responseListener", "Lcom/android/volley/Response$Listener;", "errorListener", "Lcom/android/volley/Response$ErrorListener;", "postComment", "body", "Lorg/json/JSONObject;", "postRequest", "Lcom/android/volley/toolbox/JsonObjectRequest;", "putRequest", "Companion", "app_debug"})
public final class NetworkServiceAdapter {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://misw4203-mobile-vynils.herokuapp.com/";
    @org.jetbrains.annotations.Nullable
    private static co.misw4203.grupo7.vinilos.network.NetworkServiceAdapter instance;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy requestQueue$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final co.misw4203.grupo7.vinilos.network.NetworkServiceAdapter.Companion Companion = null;
    
    public NetworkServiceAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    private final com.android.volley.RequestQueue getRequestQueue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAlbums(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<co.misw4203.grupo7.vinilos.models.Album>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAlbumById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super co.misw4203.grupo7.vinilos.models.Album> $completion) {
        return null;
    }
    
    public final void getCollectors(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.List<co.misw4203.grupo7.vinilos.models.Collector>, kotlin.Unit> onComplete, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.android.volley.VolleyError, kotlin.Unit> onError) {
    }
    
    public final void getComments(int albumId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.List<co.misw4203.grupo7.vinilos.models.Comment>, kotlin.Unit> onComplete, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.android.volley.VolleyError, kotlin.Unit> onError) {
    }
    
    public final void postComment(@org.jetbrains.annotations.NotNull
    org.json.JSONObject body, int albumId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.json.JSONObject, kotlin.Unit> onComplete, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.android.volley.VolleyError, kotlin.Unit> onError) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getBands(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<co.misw4203.grupo7.vinilos.models.Band>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getBandById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super co.misw4203.grupo7.vinilos.models.Band> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMusicians(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<co.misw4203.grupo7.vinilos.models.Musician>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMusicianById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super co.misw4203.grupo7.vinilos.models.Musician> $completion) {
        return null;
    }
    
    private final java.util.List<co.misw4203.grupo7.vinilos.models.Album> getAlbumsOfPerformers(java.lang.String response) {
        return null;
    }
    
    private final com.android.volley.toolbox.StringRequest getRequest(java.lang.String path, com.android.volley.Response.Listener<java.lang.String> responseListener, com.android.volley.Response.ErrorListener errorListener) {
        return null;
    }
    
    private final com.android.volley.toolbox.JsonObjectRequest postRequest(java.lang.String path, org.json.JSONObject body, com.android.volley.Response.Listener<org.json.JSONObject> responseListener, com.android.volley.Response.ErrorListener errorListener) {
        return null;
    }
    
    private final com.android.volley.toolbox.JsonObjectRequest putRequest(java.lang.String path, org.json.JSONObject body, com.android.volley.Response.Listener<org.json.JSONObject> responseListener, com.android.volley.Response.ErrorListener errorListener) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lco/misw4203/grupo7/vinilos/network/NetworkServiceAdapter$Companion;", "", "()V", "BASE_URL", "", "instance", "Lco/misw4203/grupo7/vinilos/network/NetworkServiceAdapter;", "getInstance", "()Lco/misw4203/grupo7/vinilos/network/NetworkServiceAdapter;", "setInstance", "(Lco/misw4203/grupo7/vinilos/network/NetworkServiceAdapter;)V", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final co.misw4203.grupo7.vinilos.network.NetworkServiceAdapter getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.Nullable
        co.misw4203.grupo7.vinilos.network.NetworkServiceAdapter p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final co.misw4203.grupo7.vinilos.network.NetworkServiceAdapter getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}