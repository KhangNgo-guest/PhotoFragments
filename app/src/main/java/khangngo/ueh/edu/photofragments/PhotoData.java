package khangngo.ueh.edu.photofragments;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0, 1,"https://a-z-animals.com/media/2021/01/Wild-Chameleon-Reptile-With-Beautiful-Colors-400x300.jpg"));
        photos.add(new Photo(1, 1,"https://a-z-animals.com/media/2021/01/Golden-eyed-leaf-frog-400x300.jpg"));
        photos.add(new Photo(2, 1,"https://a-z-animals.com/media/2020/01/Abyssinian-header-400x300.jpg"));
        photos.add(new Photo(3, 0,"https://thumbs.dreamstime.com/b/flowers-4999705.jpg"));
        photos.add(new Photo(4, 0,"https://cdn.wallpapersafari.com/8/27/bvgHTY.jpg"));
        photos.add(new Photo(5, 0,"https://pbs.twimg.com/profile_images/883859744498176000/pjEHfbdn_400x400.jpg"));
        photos.add(new Photo(6, 2,"https://images.unsplash.com/photo-1567620905732-2d1ec7ab7445?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8M3x8fGVufDB8fHx8&w=1000&q=80"));
        photos.add(new Photo(7, 2,"https://www.foodiesfeed.com/wp-content/uploads/2021/01/hot-shakshuka-819x1024.jpg"));
        photos.add(new Photo(8, 2,"https://images.unsplash.com/photo-1540189549336-e6e99c3679fe?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max"));

        return photos;
    }

    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> phs = generatePhotoData();
        for (int i = 0; i < phs.size(); i++) {
            if (phs.get(i).getId() == id){
                return phs.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Photo> getPhotoByCategory(int category){
        ArrayList<Photo> allPhotos = generatePhotoData();
        ArrayList<Photo> photos = new ArrayList<Photo>();
        for (int i = 0; i < allPhotos.size(); i++) {
            if (allPhotos.get(i).getCategory() == category){
                photos.add(allPhotos.get(i));
            }
        }

        return photos;
    }
}
