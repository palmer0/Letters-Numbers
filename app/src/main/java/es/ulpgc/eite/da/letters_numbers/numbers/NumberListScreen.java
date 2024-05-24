package es.ulpgc.eite.da.letters_numbers.numbers;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.letters_numbers.app.AppMediator;


public class NumberListScreen {

  public static void configure(NumberListContract.View view) {

//    WeakReference<FragmentActivity> context =
//        new WeakReference<>((FragmentActivity) view);

    AppMediator mediator = AppMediator.getInstance();
    //NumberListState state = mediator.getNumberListState();

    //NumberListContract.Router router = new NumberListRouter(mediator);
    //NumberListContract.Presenter presenter = new NumberListPresenter(state);
    NumberListContract.Presenter presenter = new NumberListPresenter(mediator);
    NumberListContract.Model model = new NumberListModel();
    presenter.injectModel(model);
    //presenter.injectRouter(router);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
