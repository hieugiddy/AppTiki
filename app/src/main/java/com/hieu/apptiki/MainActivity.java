package com.hieu.apptiki;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    GridView_Adapter gridView_adapter;
    List<GridItem> gridItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridView);
        gridItemList=getListData();
        gridView_adapter=new GridView_Adapter(gridItemList,this);
        gridView.setAdapter(gridView_adapter);
        registerForContextMenu(this.gridView);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this, ChiTietSP.class);
                intent.putExtra("chitiet",getListData().get(position).getMota());
                startActivity(intent);
            }
        });
    }

    private List<GridItem> getListData() {
        List<GridItem> gridItems=new ArrayList<>();
        gridItems.add(new GridItem(R.drawable.a1,"Điện thoại Vivo Y11 (3GB/32GB) - Hàng chính hãng","Điện thoại Vivo Y11 sở hữu thiết kế nguyên khối sang trọng, màu sắc được lấy cảm hứng từ những viên ngọc quý sáng lấp lánh. Trải qua quá trình chế tác thủ công tỉ mỉ, mặt lưng của Vivo Y11 có khả năng chuyển màu đẹp một cách huyền ảo. Cả hai phiên bản màu là Đỏ San Hô và Xanh Ngọc Bích đều tạo hiệu ứng đẹp lấp lánh, nổi bật."));
        gridItems.add(new GridItem(R.drawable.a2,"Điện Thoại Nokia 105 Dual Sim (2019) - Hàng Chính Hãng","Điện Thoại Nokia 105 Dual Sim (2019) có thiết kế hiện đại với các đường bo tròn độc đáo cho bạn dễ dàng cầm giữ cũng như bỏ máy vào túi. Kiểu dáng thanh lịch, cá tính và năng động cho giới trẻ. Đặc biệt hơn với nhiều màu sắc bắt mắt cho bạn dễ dàng lựa chọn theo sở thích.\n" +
                "\n" +
                "Chiếc điện thoại Nokia này có thể cho vào túi quần hay túi áo mà bạn sẽ không cảm thấy khó chịu vì nó. Đặc biệt độ hoàn thiện của những chiếc máy Nokia luôn được người dùng đáng giá rất cao và bạn sẽ không cần phải lo lắng vì có lỡ làm đánh rơi máy."));
        gridItems.add(new GridItem(R.drawable.a3,"Điện Thoại Samsung Galaxy M31 (128GB/6GB) - Hàng Chính Hãng","Mở Rộng Không Gian Trải Nghiệm Với Màn Hình Infinity-U\n" +
                "Thỏa thích làm mọi điều bạn muốn với màn hình Infinity-U 6.4 inch ấn tượng từ Điện Thoại Samsung Galaxy M31. Công nghệ Super AMOLED FHD+ truyền tải chi tiết mọi nội dung, mang đến trải nghiệm xem sống động chưa từng có dù bạn đang coi phim, chơi game hay làm việc."));
        gridItems.add(new GridItem(R.drawable.a4,"Điện Thoại Vivo Y30i (4GB/128GB) - Hàng Chính Hãng","Màn hình tràn viền kích thước lớn\n" +
                "Điện Thoại Vivo Y30i sở hữu màn hình máy có kích thước lớn 6.47 inch được tối ưu trên tấm nền IPS cho góc nhìn rộng độ sáng cao cùng chất lượng hiển thị rõ nét. Màn hình của máy có diện tích hiển thị lên tới 90.7% cùng tỉ lệ 19.5 / 9 đảm bảo máy có màn hình có kích thước lớn mà vẫn nằm gọn trong bàn tay người dùng."));
        gridItems.add(new GridItem(R.drawable.a5,"Điện Thoại iPhone 11 64GB - Hàng Chính Hãng","Thiết kế đậm chất phá cách nhưng cũng không kém sang trọng\n" +
                "Điện Thoại iPhone 11 là sản phẩm kế nhiệm cho chiếc iPhone Xr từng dành được sự chú ý của giới công nghệ. Lần này, Apple vẫn đi theo những tiêu chỉ của Xr khi tạo ra iPhone 11. Đầu tiên là thiết kế trẻ trung có thể thấy được ngay trên sự đa dạng màu sắc. Hơn nhữa, những màu của iPhone 11 đều mang xu hướng phá cách, tinh nghịch. Nhưng đồng thời, màu sắc này cũng mang trong nó một sự sang trọng nhất định."));
        gridItems.add(new GridItem(R.drawable.a6,"ĐIỆN THOẠI XIAOMI REDMI NOTE 9S - HÀNG CHÍNH HÃNG","HIỆU SUẤT VƯỢT TRỘI\n" +
                "Qualcomm Snapdragon 720G\n" +
                "Bộ xử lý Qualcomm Snapdragon 720G\n" +
                "Lần đầu tiên giới thiệu bộ xử lý Snapdragon 700 mạnh mẽ trên dòng Redmi Note\n" +
                "Bộ xử lý tám nhân hiệu suất cao, xung nhịp lên đến 2.3 GHz. Công cụ AI thế hệ thứ năm với khả năng tính toán vượt trội.\n" +
                "\n" +
                "36%: hiệu năng CPU mạnh hơn so với Snapdragon 712\n" +
                "\n" +
                "18%: hiệu năng GPU mạnh hơn so với Snapdragon 712\n" +
                "\n" +
                "Pin dung lượng siêu cao\n" +
                "5020mAh (typ) và sạc nhanh 18W\n" +
                "Cho dù bạn đang đi du lịch, công tác hoặc bận bịu công việc bên ngoài, pin dung lượng lớn là vô cùng cần thiết.\n" +
                "Với pin dung lượng cực cao 5020mAh (typ), bạn có thể sử dụng điện thoại hàng giờ liền mà không phải lo lắng về việc hết pin.\n" +
                "Redmi Note 9S hỗ trợ sạc nhanh 18W và được trang bị bộ sạc nhanh 22.5W trong hộp."));

        return gridItems;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Chọn hành động");
        menu.add(0,1,0,"Xóa");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo menuInfo= (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        GridItem gridItemSeleted=this.getListData().get(menuInfo.position);
        if(item.getItemId()==1){
            new AlertDialog.Builder(this)
                    .setMessage("Bạn có muốn xóa hay không?")
                    .setCancelable(false)
                    .setPositiveButton("Có", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            xoaSP(menuInfo.position);
                        }

                        private void xoaSP(int position) {
                            gridItemList.remove(position);
                            gridView_adapter.notifyDataSetChanged();
                        }
                    })
                    .setNegativeButton("Không",null)
                    .show();
        }
        else
            return false;
        return true;
    }

}