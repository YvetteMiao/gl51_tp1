package gl51.service

import gl51.data.Photo

interface CreateThumbnailService {

    /**
     * Create a thumbnail in 50px*50px
     * @return
     */
    Photo createThumbnail()

}