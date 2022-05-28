package Database;

import android.app.Application;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import DAO.ChildDAO;
import DAO.ChoreDAO;
import Entity.Child;
import Entity.Chore;

public class Repository {
    private ChildDAO mChildDAO;
    private List<Child> mAllChildren;
    private ChoreDAO mChoreDAO;
    private List<Chore> mAllChores;

    private static int NUMBER_OF_THREADS=4;
    static final ExecutorService databaseExecutor= Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public Repository(Application application){
        ChoreTrackerDatabaseBuilder db=ChoreTrackerDatabaseBuilder.getDatabase(application);
        mChildDAO=db.childDAO();
    }

    public void insert(Child child){
        databaseExecutor.execute(()->{
            mChildDAO.insert(child);
        });
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public List<Child> getAllChildren(){
        databaseExecutor.execute(()->{
            mAllChildren=mChildDAO.getAllChildren();
        });
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return mAllChildren;
    }

    public void update(Child child){
        databaseExecutor.execute(()->{
            mChildDAO.update(child);
        });
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void delete(Child child){
        databaseExecutor.execute(()->{
            mChildDAO.delete(child);
        });
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void insert(Chore chore){
        databaseExecutor.execute(()->{
            mChoreDAO.insert(chore);
        });
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public List<Chore> getAllChores(){
        databaseExecutor.execute(()->{
            mAllChores=mChoreDAO.getAllChores();
        });
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return mAllChores;
    }

    public void update(Chore chore){
        databaseExecutor.execute(()->{
            mChoreDAO.update(chore);
        });
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void delete(Chore chore){
        databaseExecutor.execute(()->{
            mChoreDAO.delete(chore);
        });
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
