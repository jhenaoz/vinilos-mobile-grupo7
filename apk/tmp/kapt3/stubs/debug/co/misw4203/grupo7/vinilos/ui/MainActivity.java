package co.misw4203.grupo7.vinilos.ui;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lco/misw4203/grupo7/vinilos/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lco/misw4203/grupo7/vinilos/databinding/ActivityMainBinding;", "isInternetPermissionGranted", "", "permissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "requestPermission", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.activity.result.ActivityResultLauncher<java.lang.String[]> permissionLauncher;
    private boolean isInternetPermissionGranted = false;
    private co.misw4203.grupo7.vinilos.databinding.ActivityMainBinding binding;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void requestPermission() {
    }
}