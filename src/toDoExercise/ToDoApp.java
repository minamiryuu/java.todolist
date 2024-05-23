/*
参考サイト
・https://code-lesson.com/lessons/850021c3-d463-4513-a219-14c904ecd755
・https://qiita.com/EasyCoder/items/311a70719a3ae0b14ca7
・https://www.tohoho-web.com/java/collection.htm#HashSet
・https://www.techiedelight.com/ja/swap-two-elements-list-java/
・https://www.sejuku.net/blog/14621
 */


package toDoExercise;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToDoApp {
	
	public static void main(String[] args) throws Exception{
		
		ToDo todo = new ToDo();
		int operationNum;
		System.out.println("ToDoは1件もありません。");
		do {
		System.out.println();
		System.out.println("ー操作を入力してください。ー");
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		System.out.println("1/登録 2/TODOの編集 3/削除 4/終了");
		operationNum = Integer.parseInt( br.readLine() );
		
			switch(operationNum) {
			case 1:
				System.out.println("新規ToDoを作成します。");
				System.out.println("ToDo内容を入力してください");
				String title = br.readLine();
				System.out.println("重要度を1～10(最大)で入力してください");
				int importance = Integer.parseInt(br.readLine());
				todo.addItem(title, importance);
				if(todo.Num() > 1) {
					todo.sortItem();
				}
				System.out.println("1件追加しました。");
				todo.showItem();
			break;
				
			case 2:
				System.out.println("ー操作を入力してください。ー");
				System.out.println("1/タイトル変更 2/重要度変更 3/ステータス変更");
				int operationNum1 = Integer.parseInt( br.readLine() );
					switch(operationNum1) {
					case 1:
						System.out.println("タイトルを変更します。番号を入力して下さい。0～" + (todo.Num() - 1));
						int changeNum1 = Integer.parseInt(br.readLine());
						System.out.println("タイトルを再設定してください。");
						String changetitle = br.readLine();
						todo.changetitle(changeNum1, changetitle);
						System.out.println("タイトルを変更しました。");
						todo.showItem();
					break;
					
					case 2:
						System.out.println("重要度を変更します。番号を入力して下さい。0～" + (todo.Num() - 1));
						int changeNum2 = Integer.parseInt(br.readLine());
						System.out.println("重要度を再設定してください。");
						int changeimportance = Integer.parseInt(br.readLine());
						todo.changeImp(changeNum2, changeimportance);
						System.out.println("重要度を変更しました。");
						if(todo.Num() != 1) {
							todo.sortItem();
						}
						todo.showItem();
					break;
				
					case 3:
						String changestatus;
						System.out.println("ステータスを変更します。番号を入力して下さい。0～" + (todo.Num() - 1));
						int changeNum3 = Integer.parseInt(br.readLine());
						System.out.println("ステータス(未着手/進行中/完了)を入力してください。");
						changestatus = br.readLine();
						todo.changestatus(changeNum3, changestatus);
						if(changestatus.equals("完了")) {
							todo.changeImp(changeNum3, 0);
						}
						System.out.println("ステータスを変更しました。");
						if(todo.Num() != 1) {
							todo.sortItem();
						}
						todo.showItem();
					break;
					default:
						System.out.println("1～3の数字を入力してください。");
					}
			break;
			
			case 3:
				System.out.println("ToDoを削除します。番号を入力して下さい。0～" + (todo.Num() - 1));
				int deleteNum = Integer.parseInt(br.readLine());
				todo.deleteItem(deleteNum);
				System.out.println("1件削除しました。");
				if(todo.Num() != 1) {
					todo.sortItem();
				}
				todo.showItem();
			break;
			
			case 4:
			break;
				
			default:
				System.out.println("1～4の数字を入力してください。");
			}
		} while(operationNum != 4);
		System.out.println("アプリケーションを終了します。");
        
	}

}
