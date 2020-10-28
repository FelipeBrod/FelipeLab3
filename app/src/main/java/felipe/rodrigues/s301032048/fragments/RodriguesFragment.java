package felipe.rodrigues.s301032048.fragments;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import felipe.rodrigues.s301032048.R;
import felipe.rodrigues.s301032048.activity.FelipeActivity;

public class RodriguesFragment extends Fragment {

private Button camera;
private static final int CAMERA_PERMISSION_CODE = 100;

  public RodriguesFragment(){

  }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_rodrigues, container, false);

      camera = view.findViewById(R.id.buttonCamera);


      camera.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
          checkPermission(Manifest.permission.CAMERA,
                  CAMERA_PERMISSION_CODE);
        }
      });

      return view;
    }

  // Function to check and request permission.
  public void checkPermission(String permission, int requestCode) {
    if (ContextCompat.checkSelfPermission(getView().getContext(), permission)
            == PackageManager.PERMISSION_DENIED) {

      // Requesting the permission
      ActivityCompat.requestPermissions(getActivity(),
              new String[]{permission},
              requestCode);
    } else {
      Toast.makeText(getView().getContext(),
              "Permission already granted",
              Toast.LENGTH_SHORT)
              .show();
    }
  }

  @Override
  public void onRequestPermissionsResult(int requestCode,
                                         @NonNull String[] permissions,
                                         @NonNull int[] grantResults)
  {
    super
            .onRequestPermissionsResult(requestCode,
                    permissions,
                    grantResults);

    if (requestCode == CAMERA_PERMISSION_CODE) {
      if (grantResults.length > 0
              && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
        Toast.makeText(getView().getContext(),
                "Camera Permission Granted",
                Toast.LENGTH_SHORT)
                .show();
      }
      else {
        Toast.makeText(getView().getContext(),
                "Camera Permission Denied",
                Toast.LENGTH_SHORT)
                .show();
      }
      }
    }
}