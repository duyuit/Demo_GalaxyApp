package Adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.billy.galaxy_app.R;

import java.util.List;

import Model.Shop;

/**
 * Created by Billy on 10/4/2017.
 */

public class Adapter_Content_Shop extends ArrayAdapter {
    Activity context;
    int resource;
    List<Shop> objects;

    public Adapter_Content_Shop(Activity context, int resource, List<Shop> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource, null);

        TextView txtName=row.findViewById(R.id.txtName);
        TextView txtSale=row.findViewById(R.id.txtSale);
        TextView txtTitle=row.findViewById(R.id.txtTitle);
        TextView txtDate=row.findViewById(R.id.txtDate);
        TextView txtLike=row.findViewById(R.id.txtLike);
        TextView txtComment=row.findViewById(R.id.txtComment);
        TextView txtRate=row.findViewById(R.id.txtRate);


        final Shop hoa = this.objects.get(position);
        txtName.setText(hoa.getName());
        txtSale.setText(hoa.getSale());
        txtTitle.setText(hoa.getTitle());
        txtDate.setText(hoa.getDate());
        txtLike.setText(hoa.getLike());
        txtComment.setText(hoa.getComment());
        txtRate.setText(hoa.getRate());
        return row;
    }
}
