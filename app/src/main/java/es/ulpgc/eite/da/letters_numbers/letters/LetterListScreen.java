package es.ulpgc.eite.da.letters_numbers.letters;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.letters_numbers.app.AppMediator;


public class LetterListScreen {

  public static void configure(LetterListContract.View view) {

//    WeakReference<FragmentActivity> context =
//        new WeakReference<>((FragmentActivity) view);

    AppMediator mediator = AppMediator.getInstance();
    LetterListContract.Presenter presenter = new LetterListPresenter(mediator);

    LetterListContract.Model model = new LetterListModel();

    presenter.injectModel(model);
    presenter.injectView(new WeakReference<>(view));
    view.injectPresenter(presenter);

  }
}
