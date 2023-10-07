package com.kiparo.newsapp.presentation.features.articles.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow

import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.kiparo.newsapp.R
import com.kiparo.newsapp.domain.models.Article
import com.kiparo.newsapp.presentation.core_ui.theme.height_article_item
import com.kiparo.newsapp.presentation.core_ui.theme.padding_6
import com.kiparo.newsapp.presentation.core_ui.theme.round_corner
import com.kiparo.newsapp.presentation.core_ui.theme.size_article_item
import com.kiparo.newsapp.presentation.core_ui.theme.space_16
import com.kiparo.newsapp.presentation.core_ui.theme.space_4

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun ArticleItem (article: Article, modifier: Modifier=Modifier) {
    Row(
        modifier = modifier.height(height_article_item)

    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(round_corner))
                .background(MaterialTheme.colorScheme.surface)
                .padding(padding_6)
        ) {
            GlideImage(
                modifier = Modifier
                    .size(size_article_item)
                    .clip(RoundedCornerShape(space_16)),
                model = article.imageUrl,
                contentDescription = "Article_Image",
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.width(space_16))
        Column {
            Text(
                text = stringResource(id = R.string.news_section,article.section),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = MaterialTheme.typography.bodySmall,
            )
            Spacer(modifier = Modifier.width(space_4))
            Row {
                Icon(
                    painter = painterResource(id = R.drawable.ic_calendar),
                    contentDescription = "Calendar icon",
                    tint = Color.Unspecified
                )
                Spacer(modifier = Modifier.width(space_4))
                Text(
                    text = "2th May",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    style = MaterialTheme.typography.bodySmall
                )
                Spacer(modifier = Modifier.width(space_16))
                Icon(
                    painter = painterResource(id = R.drawable.ic_clock),
                    contentDescription = "Calendar icon",
                    tint = Color.Unspecified
                )
                Spacer(modifier = Modifier.width(space_4))
                Text(
                    text = "12:15 pm",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    style = MaterialTheme.typography.bodySmall
                )
                Spacer(modifier = Modifier.width(space_16))
            }
        }
    }
}

