package oxim.digital.reedly.ui.feed.subscription;

import java.util.List;

import oxim.digital.reedly.base.BaseView;
import oxim.digital.reedly.base.ScopedPresenter;
import oxim.digital.reedly.ui.feed.model.FeedViewModel;

public interface UserSubscriptionsContract {

    interface View extends BaseView {

        void showFeedSubscriptions(List<FeedViewModel> feedSubscriptions);

        void setIsBackgroundFeedUpdateEnabled(boolean isEnabled);
    }

    interface Presenter extends ScopedPresenter {

        void showFeedItems(FeedViewModel feedViewModel);

        void showAddNewFeed();

        void updateUserSubscriptions();

        void unsubscribeFromFeed(FeedViewModel selectedFeedModel);

        void showFavouriteFeedItems();

        void enableBackgroundFeedUpdates();

        void disableBackgroundFeedUpdates();
    }
}
